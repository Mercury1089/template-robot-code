# template-robot-code
A robot project template, which can be downloaded and used as a starting point for any FRC robot. Simply download this repo and start programming!

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

...along with any task that you would want to run.

## Gradle Multi-project
This gradle project is already set up to utilize a multiproject structure, just add the module name into
the `settings.gradle` file.

From there, you can customize each subproject to your liking, whether that's applying the EmbeddedTools
plugin for deploying artifacts to other targets, adding extra dependencies for other projects, etc.

Each subproject can be accessed using a colon to specify the subproject,
then another colon to run tasks from that project.

EX:
```cmd
> gradlew :robot:deploy
```
will run the deploy command for the robot subproject ONLY.

## Credits
[Jaci](https://github.com/JacisNonsense) for creating the Gradle plugins that allow this to work  
[Endoman123](https://github.com/Endoman123) for creating a motion profile generator frontend to use
[croadfeldt](https://github.com/croadfeldt/wpilib_pixy_spi_java) for the original versions of the Pixy SPI and I2C classes