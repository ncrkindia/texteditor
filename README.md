# NCRK TextEditor beta-v0.3.0

A lightweight, simple Desktop Text Editor built using Java AWT and Swing. This is the **beta-v0.3.0 release**, offering core text editing functionalities similar to classic Notepad.

## 🚀 Features

*   **File Management**: Create New, Open, Save, Save As, Close, and Exit (with unsaved changes warnings).
*   **Edit Operations**: Native Cut, Copy, Paste, Delete, and Select All.
*   **Search**: Find/Replace All dialog logic.
*   **View Customization**: Dynamic text Zoom In/Out, Font dialog selection, and customizable Foreground/Background Colors.
*   **Modular GUI**: De-coupled forms using NetBeans GUI Builder, breaking logic down into multiple specialized `.java` and `.form` components.
*   **Cross-Platform**: Built purely with Java Swing, making it platform-independent (Windows, macOS, Linux).

## 🛠️ Technology Stack
*   **Language**: Java (JDK 8 or higher recommended)
*   **GUI Framework**: `javax.swing` and `java.awt`
*   **Architecture**: Modular GUI using NetBeans Form Builder and decoupled Java dialogs

## 💻 Getting Started

### Using an IDE (NetBeans, Eclipse, IntelliJ)
1. Open the project folder in your preferred Java IDE (Ant build configuration `build.xml` is provided for Apache NetBeans).
2. Run the main class located at `src/JC024.java`.

### Running from the Command Line
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

### beta-v0.3.0
*   **Major UI Refactoring**: Transitioned from a single-file codebase to a modular application architectural layout using NetBeans GUI Builder.
*   **Enhanced Customization**: Added dedicated custom dialog forms for customizing Fonts, Background Colors, and Foreground Colors.
*   **Resource Bundles**: Introduced `Bundle.properties` and a dedicated `icons` folder for internationalization and richer GUI design.

### beta-v0.2.1
*   **Build Optimization**: Extended `.gitignore` to omit compiled output directories (`*/classes/*`), further improving repository cleanliness, particularly for IDE and Ant build outputs.

### beta-v0.1.1
*   **Repository Maintenance**: Updated `.gitignore` to prevent tracking compiled `*.class` binaries, keeping the repository cleaner.
