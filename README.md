# template-robot-code
Template robot project for any season

## Gradle
Gradle is a flexible build tool that this entire project is using to deploy to the robot, test code, etc.

To use, simply use from the root of the project:

### Windows
```cmd
> gradlew <some task>
```

### Unix/macOS
```bash
$ ./gradlew <some task>
```

...along with any task that you would want to run. Some useful tasks:
- `deploy`: deploys code to the robot
- `shuffleboard`: runs the shuffleboard
