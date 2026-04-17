Modern Angular (v17+):

### 1. Components & Templates (The Visuals)
Search these terms to master how the UI is built and how data binds to it.
* **Standalone Components:** Understand how a component works without an `NgModule`.
* **Template Binding:** Specifically look at **Interpolation** `{{ }}` and **Property Binding** `[ ]`.
* **Event Binding:** How to listen to user actions `(click)`.
* **Two-Way Binding:** Using `[(ngModel)]` (though you'll use this less with Reactive Forms).
* **Control Flow:** Specifically learn `@if`, `@for` (and its required `track` property), and `@switch`.
* **Content Projection:** Learn how `<ng-content>` works to build reusable UI cards or layouts.
* **Deferrable Views:** Search for `@defer` to learn how to lazy-load parts of a component template.

### 2. Reactivity (Managing State)
This is the modern way Angular handles data changes. 
* **Signals:** The core concept. Understand how to create a `signal()`.
* **Computed Signals:** Using `computed()` to derive state from other signals.
* **Effects:** Using `effect()` to run code when a signal changes (like saving to local storage).
* **Component Lifecycle:** Focus on `ngOnInit` (for setup) and `ngOnDestroy` (for cleanup).

### 3. Dependency Injection (The Logic)
This is how you share data and logic across your app without repeating yourself.
* **Injectable Services:** Creating classes decorated with `@Injectable({ providedIn: 'root' })`.
* **The `inject` Function:** The modern, cleaner way to grab a service inside a component (e.g., `const myService = inject(MyService);`).

### 4. Routing (Navigation)
How users move around your application.
* **Router Setup:** Defining the `Routes` array.
* **RouterLink:** The directive to navigate between pages without reloading the browser.
* **Route Parameters:** How to read IDs from the URL (e.g., `/user/123`).
* **Route Guards:** Specifically look at `CanActivateFn` to protect routes (like a dashboard that requires login).

### 5. Forms (User Input)
* **Reactive Forms:** This is the industry standard. Search for **FormGroup**, **FormControl**, and **FormBuilder**.
* **Built-in Validators:** How to make fields required or check for valid emails.
* **Custom Validators:** How to write your own logic to validate an input.

### 6. Client-Server Communication (The Backend Bridge)
By the time you are ready to connect your Angular frontend to your Spring Boot API, you must know these two concepts inside and out:
* **HttpClient:** Using `inject(HttpClient)` to make `get()` and `post()` requests.
* **HttpInterceptors:** Search for the modern functional interceptors (`HttpInterceptorFn`). You will need this to attach JWT auth tokens to your backend requests automatically.

***

**The Execution Strategy:**
Don't read the docs like a book. Pick one topic from the list (e.g., "Computed Signals"), search it on `angular.dev`, read the 2-minute explanation, and then immediately build a tiny feature using it. 
