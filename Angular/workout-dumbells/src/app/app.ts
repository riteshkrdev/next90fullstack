import { Component, Inject, OnInit, PLATFORM_ID } from '@angular/core';
import { CommonModule,isPlatformBrowser } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './app.html',
  styleUrls: ['./app.css'], 
})
export class App implements OnInit {
  activeDay: string = '1';

  // Modal state
  showModal = false;
  selectedImageUrl = '';
  selectedExerciseName = '';

  workouts: any = {
    1: [
      { name: 'Bent Over Dumbbell Row', sets: 4, reps: '8-10', image: 'images/bent-over-row.jpg' },

      { name: 'Dumbbell Bench Press', sets: 4, reps: '8-10' },

      { name: 'Dumbbell Lateral Raise', sets: 3, reps: '8-12' },

      { name: 'Dumbbell Pullover', sets: 3, reps: '8-12' },

      { name: 'Dumbbell Bicep Curl', sets: 2, reps: '8-12' },

      { name: 'Dumbbell Tricep Extension', sets: 2, reps: '8-12' },

      { name: 'Dumbbell Shrug', sets: 2, reps: '12-15' },
    ],

    2: [
      { name: 'Goblet Squat', sets: 4, reps: '8-10' },

      { name: 'Dumbbell Stiff Leg Deadlift', sets: 4, reps: '8-10' },

      { name: 'Dumbbell Plie Squat', sets: 3, reps: '8-12' },

      { name: 'Dumbbell Hamstring Curl', sets: 3, reps: '8-12' },

      { name: 'Standing Dumbbell Calf Raise', sets: 3, reps: '8-12' },

      { name: 'Plank', sets: 3, reps: '20 Secs' },
    ],

    3: [
      { name: 'One Arm Dumbbell Row', sets: 4, reps: '8-10' },

      { name: 'Dumbbell Shoulder Press', sets: 4, reps: '8-10' },

      { name: 'Incline Dumbbell Bench Press', sets: 3, reps: '8-12' },

      { name: 'Chest Supported Dumbbell Row', sets: 3, reps: '8-12' },

      { name: 'Dumbbell Hammer Curl', sets: 2, reps: '8-12' },

      { name: 'Dumbbell Floor Press', sets: 2, reps: '8-12' },

      { name: 'Seated Dumbbell Shrug', sets: 2, reps: '12-15' },
    ],

    4: [
      { name: 'Dumbbell Stiff Leg Deadlift', sets: 4, reps: '8-10' },

      { name: 'Dumbbell Rear Lunge', sets: 4, reps: '8-10' },

      { name: 'Dumbbell Hip Thrust', sets: 4, reps: '8-10' },

      { name: 'Dumbbell Split Squat', sets: 3, reps: '8-12' },

      { name: 'Seated Dumbbell Calf Raise', sets: 3, reps: '8-12' },

      { name: 'Planks', sets: 3, reps: '20 Secs' },
    ],
  };

  constructor(@Inject(PLATFORM_ID) private platformId:Object){}

  ngOnInit() {
    if(isPlatformBrowser(this.platformId)){
      this.activeDay = localStorage.getItem('activeTab') || '1';
    }
  }

  // Handle Tab Switching
  switchTab(day: string) {
    this.activeDay = day;
    if(isPlatformBrowser(this.platformId)){
      localStorage.setItem('activeTab', day);
    }

    
    window.scrollTo(0, 0);
  }

  // Checkbox Logic
  onCheckboxChange(day: string, index: number, event: any) {
    if(isPlatformBrowser(this.platformId)){
      const isChecked = event.target.checked;
      localStorage.setItem(`day${day}-ex${index}`, isChecked.toString());
    }
  }

  isCompleted(day: string, index: number): boolean {
    if(isPlatformBrowser(this.platformId)){
     
      return localStorage.getItem(`day${day}-ex${index}`) === 'true';
    }
    return false;
  }

  // Modal Logic
  openModal(imageUrl: string, name: string) {
    this.selectedImageUrl = imageUrl;
    this.selectedExerciseName = name;
    this.showModal = true;
  }

  closeModal() {
    this.showModal = false;
  }

  // Fallback image generator
  getImgUrl(ex: any) {
    return ex.image
      ? ex.image
      : `https://placehold.co/120x120/1e293b/10b981?text=${ex.name
          .split(' ')
          .map((w: any) => w[0])
          .join('')}`;
  }

  resetCurrentDay() {
    if (isPlatformBrowser(this.platformId) && confirm('Clear progress for the current day?')) {
      this.workouts[this.activeDay].forEach((_: any, index: number) => {
        localStorage.removeItem(`day${this.activeDay}-ex${index}`);
      });
      // Force refresh of checkbox states (Optional: use Signal for better reactivity)
      window.location.reload();
    }
  }
}
