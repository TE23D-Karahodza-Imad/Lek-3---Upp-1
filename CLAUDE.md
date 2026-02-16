# CLAUDE.md

## Project Overview

This is a **Java console application** simulating a theme park (Gröna Lund) ticket coupon system. It is an educational assignment (Lektion 3 - Uppgift 1) from a Swedish programming course. The application lets a visitor spend 10 coupons on various attractions, with eligibility checks based on age and height.

All user-facing text and variable names are in **Swedish**.

## Repository Structure

```
.
├── src/
│   └── App.java          # Main (and only) source file — all application logic
├── bin/
│   └── App.class          # Compiled bytecode (generated)
├── .vscode/
│   └── settings.json      # VS Code Java project configuration
├── README.md              # Default VS Code Java getting-started guide
└── CLAUDE.md              # This file
```

## Language & Dependencies

- **Language**: Java (standard library only, no external dependencies)
- **Build tooling**: VS Code Java extension (no Maven, Gradle, or Makefile)
- **No testing framework** is configured

## Build & Run

### Compile

```bash
javac -d bin src/App.java
```

### Run

```bash
java -cp bin App
```

The program is interactive (reads from `System.in` via `Scanner`), so it requires manual terminal input.

### VS Code

Open the project in VS Code with the Java extension installed. Source path (`src/`) and output path (`bin/`) are configured in `.vscode/settings.json`.

## Code Conventions

- **Single-file architecture**: All logic lives in `src/App.java` inside the `main` method
- **Swedish naming**: Variables, output strings, and comments use Swedish (e.g., `kuponger`, `fårÅka`, `längd`, `ålder`)
- **Variable naming**: camelCase (e.g., `kuponger`, `fårÅka`)
- **Class naming**: PascalCase (`App`)
- **Control flow**: `while` loop for the main game loop, `switch` for menu selection, boolean flags for ride eligibility
- **Input handling**: `java.util.Scanner` for all user input
- **No OOP decomposition**: No separate classes for attractions, visitors, etc. — this is procedural, beginner-level code

## Application Logic

1. Visitor starts with **10 coupons**
2. A menu offers three attractions plus an exit option:
   - **Cirkuskarusellen** — 2 coupons, no restrictions
   - **Fritt Fall** — 4 coupons, requires age >= 12 and height >= 140 cm
   - **Berg- och dalbana** — 3 coupons, requires height >= 120 cm
3. Eligibility is validated per-ride; coupons are deducted on success
4. The loop ends when coupons run out or the user selects option 4

## Testing

There are no automated tests. Testing is done manually by running the program and providing console input.

## CI/CD

No CI/CD pipelines are configured.

## Key Files

| File | Purpose |
|------|---------|
| `src/App.java` | Entire application source code |
| `.vscode/settings.json` | VS Code Java project paths |
| `bin/App.class` | Compiled output (do not edit) |

## Notes for AI Assistants

- Preserve the **Swedish language** for all variable names and user-facing strings when modifying code
- The project is intentionally simple — avoid over-engineering or introducing unnecessary abstractions
- `bin/` contains compiled output; always recompile after source changes
- The `Scanner` is closed at program exit (`sc.close()`)
- Unicode characters are used in identifiers (e.g., `ålder`, `längd`, `fårÅka`) — ensure the compiler and editor support UTF-8
