Warehouse Inventory App

This is my CS 360 final project developed for the Mobile Architecture and Programming course at Southern New Hampshire University.

Project Overview

The Warehouse Inventory App was designed to address the needs of small businesses requiring a straightforward solution for inventory management. The primary requirements included creating a user authentication system, implementing a database to store and display inventory items, and developing SMS notifications for low stock alerts. The app aimed to solve the common problem of inventory tracking without complex enterprise systems, helping small business owners maintain accurate stock counts, prevent stockouts, and manage their inventory efficiently from a mobile device.

UI Design & Features

The user interface was developed with a focus on simplicity and efficiency, featuring three main screens:

Screenshots

![Screenshot 2025-04-11 220617](https://github.com/user-attachments/assets/056d4634-3c49-44c6-96ef-0527329602ae)

![Screenshot 2025-04-11 220657](https://github.com/user-attachments/assets/6424002f-d8ab-473f-ae36-fe6ffeac0f97)


A login screen with username/password fields and account creation option
An inventory dashboard displaying items in a grid format with search functionality
Item management dialogs for adding, editing, and removing inventory

The UI design maintained a consistent brown color scheme with a clipboard and gears motif that visually communicated the app's purpose. I kept users in mind by implementing clear visual hierarchy, placing frequently used functions (like the add item button) within easy reach, and ensuring adequate contrast for readability. The design proved successful because it provided quick access to essential functions while maintaining a clean, uncluttered interface that business owners with varying levels of technical proficiency could navigate intuitively.

Development Approach

My coding approach centered on modular development and separation of concerns. I first established the database structure before implementing the UI components and finally connecting them through controller logic. This strategy of building foundational elements before adding complexity helped maintain clean, organized code. I used extensive commenting and consistent naming conventions to enhance readability, a practice I'll continue in future projects. For database operations, I implemented helper methods that encapsulated SQL operations, which will be applicable in future data-driven applications regardless of the specific domain.

Testing Methodology

I tested the application throughout development using the Android Emulator with various device configurations. My testing focused on validating core functionality (CRUD operations), error handling (input validation, exception management), and edge cases (empty fields, incorrect login attempts). This testing process was crucial as it revealed several issues I hadn't anticipated, such as the need for better error messaging when database operations failed and handling SMS permissions when users denied access. Addressing these issues significantly improved the app's stability and user experience.

Innovation and Challenges

The most significant challenge I faced was implementing the SMS notification system while ensuring the app remained fully functional when permissions were denied. I innovated by creating a robust permission-handling architecture that gracefully adapted to the user's choice, displaying appropriate UI feedback and maintaining core functionality regardless of permission status. This approach required developing parallel paths in the code that could converge while maintaining a consistent user experience, a design pattern I hadn't previously implemented but proved valuable for managing optional features.

Areas of Strength

I was particularly successful in demonstrating my skills in database implementation. The SQLite integration showcases my ability to design efficient data models, implement secure CRUD operations, and connect database functionality to the UI. The implementation includes transaction management, proper cursor handling, and query optimization. This component demonstrates not only technical proficiency in Android-specific database management but also broader software development principles like data validation, error handling, and separation of concerns.

Credits

Developed by Ronnie Corpuz for CS 360 Mobile Architecture and Programming at Southern New Hampshire University.
