# template-robot-code:robot
The robot subproject. This contains all the code/artifacts meant to be deployed
to the roboRIO.

## Motion Profiling
As it is a fan favorite ability, motion profiling is included in the project by default;
not just the system to run profiles, but a profile generator to create trajectories as well.

Trajectories are generated on deploy, so the only thing that needs to be stored are the project
files from the motion profile generator. These should be stored in the
`/trajectories/` directory in this project.

From there, you can utilize the `MoveOnPath` command for running
motion profiles; just use the builder methods for creating the command
and loading the trajectory from file:

```java
// Load a motion profile from a *.traj file
MoveOnPath cmd = MoveOnPath.fromTraj("SwitchFrontRight", Direction.FORWARDS);

// Start the command
cmd.start();
```

## Useful Gradle Tasks
- `deploy`: deploys the code to the rio
    - NOTE: Using the flag `-Pdeploy-dry-instant` with this
    task will allow you to run an instant dry deploy; this can be used to
    test the deploy command in case you modify it in any way.
- `shuffleboard`: runs the FRC Shuffleboard app
- `runMotionProfileGenerator`: runs the motion-profile-generator