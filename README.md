# NCRK TextEditor v1.1.1 🎉

A lightweight, simple Desktop Text Editor built using Java AWT and Swing. This is the **v1.1.1 stable release**, offering core text editing functionalities similar to classic Notepad with a fully modular graphical interface.

## 🚀 Features

*   **File Management**: Create New, Open, Save, Save As, Close, and Exit (with unsaved changes warnings).
*   **Edit Operations**: Native Cut, Copy, Paste, Delete, and Select All.
*   **Search**: Find/Replace All dialog logic.
*   **View Customization**: Dynamic text Zoom In/Out, Font dialog selection, and customizable Foreground/Background Colors.
*   **Modular GUI**: De-coupled forms using NetBeans GUI Builder, breaking logic down into multiple specialized `.java` and `.form` components (unified under `MainFrame`).
*   **Live Status**: Integrated background threading for real-time Date and Time status updates.
*   **Cross-Platform**: Built purely with Java Swing, making it platform-independent (Windows, macOS, Linux).

## 🛠️ Technology Stack
*   **Language**: Java (JDK 8 or higher recommended)
*   **GUI Framework**: `javax.swing` and `java.awt`
*   **Architecture**: Modular GUI using NetBeans Form Builder and decoupled Java dialogs

## 💻 Getting Started

### 🌐 Java Web Start (New in v0.4.0)
You can launch the application straight from the web or desktop using the provided Java Web Start launcher.
1. Navigate to the `dist` directory.
2. Execute the `launch.jnlp` file using your system's Java Web Start client:
   ```bash
   javaws launch.jnlp
   ```

### 📦 Running the Pre-compiled JAR (Recommended)
You can directly run the editor without compiling the source code using the distributed JAR file.
1. Navigate to the `dist` directory:
   ```bash
   cd dist
   ```
2. Execute the jar file:
   ```bash
   java -jar TextEditor.jar
   ```

### Using an IDE (NetBeans, Eclipse, IntelliJ)
1. Open the project folder in your preferred Java IDE (Ant build configuration `build.xml` is provided for Apache NetBeans).
2. Run the main class located at `src/JC024.java`.

### Compiling from the Command Line
1. Navigate to the `src` directory:
   ```bash
   cd src
   ```
2. Compile the Java file:
   ```bash
   javac JC024.java
   ```
3. Run the application:
   ```bash
   java JC024
   ```

## 📜 About
*   **Developer**: NCRK Rajput at SUNRISE Technologies.
*   **Repository URL**: [https://github.com/ncrkindia/texteditor.git](https://github.com/ncrkindia/texteditor.git)
*   **Official Website**: [www.ncrkindia.in](http://www.ncrkindia.in)

## 🆕 Changelog

### v1.1.1
*   **New Feature - Help System**: Completely integrated a new Help module (`HelpBook.java` & `HelpBook1.java`) to provide internal user guidance.
*   **Application Polish**: Rolled out a new dynamic asset loader screen (`WaitImage.java`), injected further localization strings (`Bundle.properties`), and updated existing components (`AboutUs`, `MainFrame`).
*   **Deployment Rebranding**: Standardized the naming convention of archived deployment JARs located in `/dist` to utilize the `NCRK_TextEditor_*` branded prefix.

### v1.1.0
*   **Archival Deployment Hub**: Populated the `dist` deploy folder with several pre-compiled permutations of the engine (e.g. `TextEditor_v1.0.jar`, `TextEditor_v4.2.jar`) alongside the foundational `TextEditor.jar`. 
*   **General UI Polish**: Implemented cumulative UI improvements, asset refinements (`3.jpg`), and bug fixes traversing the core views (`MainFrame`, `Starting`, `AboutUs`).

### v1.0.2
*   **Maintenance & Polish**: Incremental logic tweaks deployed to `MainFrame.java`, internal `Property.java` registries, and the `AboutUs` UI dialog.
*   **Deployment Additions**: Expanded the Java Web Start profiles, generating new deployment targets at the project root (`master-application.jnlp`, `preview-application.html`) for far easier local initialization.

### v1.0.1
*   **UI Tweaks**: Incremental refinements to the `FontDialog.java` component and internal `Property.java` mechanisms.
*   **Asset Updates**: Added/refined the formal application title icon (`src/icons/title.gif`) and updated banner imagery (`3.jpg`), successfully integrating them into the `MainFrame` window.

### v1.0.0 (Initial Stable Release)
*   **Architecture Finalization**: Refactored the previous prototype GUI into `MainFrame`, serving as the definitive application entry and layout backbone.
*   **New Feature - Status Bar**: Introduced `TimeDateUpdationThread.java`, a dedicated independent background thread providing real-time clock and calendar tracking.
*   **Polishing**: Touched up `AboutUs.java`, `Search.form`, and `Property.java` for final production readiness, alongside finalized Ant build definitions (`nbproject/project.xml`).

### beta-v0.4.2
*   **Build & Deployment**: Build-focused maintenance release. Iteratively updated the NetBeans build profiles (`nbproject/`, `build.xml`) and the generated Java Web Start deployment artifacts (`dist/launch.jnlp`). No structural Java code changes were introduced.

### beta-v0.4.1
*   **Startup & UI Polish**: Refined the application startup sequence (`Starting.java`) and iteratively polished several GUI dialogs including the Background Color Chooser and the Search form.
*   **Asset Updates**: Minor updates to visual image assets (`3.jpg`).

### beta-v0.4.0
*   **Java Web Start**: Generated `launch.jnlp` in the `dist` directory, allowing the application to be natively deployed and launched via Java Web Start.
*   **UI Properties & Assets**: Refined the NetBeans form components (`JFrame1.form`, `Search.form`), fixed properties, and updated GUI image assets (`3.jpg`).
*   **Build Subsystem**: Refactored the Ant configurations (`nbproject`, `build.xml`) to support the new JNLP deployment targets.

### beta-v0.3.1
*   **Release Artifacts**: Shipped a pre-compiled, directly executable binary (`dist/TextEditor_v3.1.jar`) for instant out-of-the-box usage.
*   **Codebase Cleanup**: Removed obsolete test classes (`JFrame1Test.java`) and extraneous preview HTML files, reducing repository clutter.
*   **UI Polish**: Incremental refinements to the main editor form (`JFrame1`), `Property` system, and related image assets.

### beta-v0.3.0
*   **Major UI Refactoring**: Transitioned from a single-file codebase to a modular application architectural layout using NetBeans GUI Builder.
*   **Enhanced Customization**: Added dedicated custom dialog forms for customizing Fonts, Background Colors, and Foreground Colors.
*   **Resource Bundles**: Introduced `Bundle.properties` and a dedicated `icons` folder for internationalization and richer GUI design.

### beta-v0.2.1
*   **Build Optimization**: Extended `.gitignore` to omit compiled output directories (`*/classes/*`), further improving repository cleanliness, particularly for IDE and Ant build outputs.

### beta-v0.1.1
*   **Repository Maintenance**: Updated `.gitignore` to prevent tracking compiled `*.class` binaries, keeping the repository cleaner.
