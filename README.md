# School Class 

The goal of this project is to allow user to add students (name and note) in a list and then search a student name wich will search and show all students notes wih this name. 

## Getting Started

### Prerequisites

List all dependencies and their version needed by the project as :

* Java 25 2025-09-16 LTS or Later [download](https://www.java.com/en/download/manual.jsp)
* IDE used Visual Studio Code [download](https://code.visualstudio.com/)
* OS supported MacOS M4

### Configuration

No configuration need.

## Deployment

To run the project : 
```shell
java Main.java 
```

## Directory structure

* Tip: try the tree bash command

```shell
├───.gitignore
├───README.md
├───Main.java
├───SchoolClass.java
├───Student.java
```

## Collaborate
### Gitflow Workflow

We use the Gitflow workflow for managing our branches:

- `main`: Production-ready code
- `develop`: Main development branch
- `feature/*`: New features
- `release/*`: Release preparation
- `hotfix/*`: Emergency fixes for production
- `bugfix/*`: Bug fixes for development

Branch naming convention:

- Features: `feature/descriptive-name`
- Bugfixes: `bugfix/issue-description`
- Hotfixes: `hotfix/critical-issue`
- Releases: `release/version-number`

### Development Process

1. Create a new branch from `develop` for your work
2. Make your changes in small, focused commits
3. Push your branch and create a Pull Request
4. Ensure CI passes and request review
5. After approval, merge using squash merge

### Conventional Commits

We strictly follow the Conventional Commits specification. Each commit message must be structured as follows:

```
<type>: <description>

[optional body]

[optional footer(s)]
```

Types:

- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `style`: Code style changes (formatting, etc.)
- `refactor`: Code refactoring
- `test`: Adding or modifying tests
- `chore`: Maintenance tasks

Examples:

```
feat: add login functionality
fix: correct timeout handling
docs: update API documentation
```

For more details on Conventional Commits, visit [conventionalcommits.org](https://www.conventionalcommits.org/).

---
### Naming convention Java

| Nom              | Case              | Example                         |
| :----------------| :---------------- | :------------------------------ |
| Class/Interface  | PascalCase        | public class ArroserPlantes     |
| Methods          | camelCase         | public static void mainMethod   |
| Varriables       | camelCase         | int nombrePlantes = 5;          |
| Final (constant) | camelCase         | final int nombrePlantes = 5;    |
| Fichier          | PascalCase        | `Main.java`, `UserService.java` |


## License

MIT

## Contact

If you have any quiestions you can contact us by making an issue.

