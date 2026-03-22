# NCRK TextEditor beta-v0.2.1

A lightweight, simple Desktop Text Editor built using Java AWT and Swing. This is the **beta-v0.2.1 release**, offering core text editing functionalities similar to classic Notepad, integrated into a single-file application architecture.

## 🚀 Features

*   **File Management**: Create New, Open, Save, Save As, Close, and Exit (with unsaved changes warnings).
*   **Edit Operations**: Native Cut, Copy, Paste, Delete, and Select All.
*   **Search**: Find/Replace All dialog logic.
*   **View Customization**: Dynamic text Zoom In/Out to quickly adjust the font size.
*   **Cross-Platform**: Built purely with Java Swing, making it platform-independent (Windows, macOS, Linux).

## 🛠️ Technology Stack
*   **Language**: Java (JDK 8 or higher recommended)
*   **GUI Framework**: `javax.swing` and `java.awt`
*   **Architecture**: Single-file standard MVC-style UI design (`src/JC024.java`)

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

### beta-v0.2.1
*   **Build Optimization**: Extended `.gitignore` to omit compiled output directories (`*/classes/*`), further improving repository cleanliness, particularly for IDE and Ant build outputs.

### beta-v0.1.1
*   **Repository Maintenance**: Updated `.gitignore` to prevent tracking compiled `*.class` binaries, keeping the repository cleaner.
