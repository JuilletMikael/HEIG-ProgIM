# Contribution guide

source: <https://docs.github.com/en/communities/setting-up-your-project-for-healthy-contributions/setting-guidelines-for-repository-contributors>

## Gitflow Workflow

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

## Development Process

1. Create a new branch from `develop` for your work
2. Make your changes in small, focused commits
3. Push your branch and create a Pull Request
4. Ensure CI passes and request review
5. After approval, merge using squash merge

## Conventional Commits

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

## Naming convention Java

| Nom              | Case        | Example                         |
| :--------------- | :---------- | :------------------------------ |
| Class/Interface  | PascalCase  | public class ArroserPlantes     |
| Methods          | camelCase   | public static void mainMethod   |
| Varriables       | camelCase   | int plantNumber = 5;            |
| Final (constant) | UPPER_SNAKE | final int PLANT_NUMBER = 5;     |
| Fichier          | PascalCase  | `Main.java`, `UserService.java` |
