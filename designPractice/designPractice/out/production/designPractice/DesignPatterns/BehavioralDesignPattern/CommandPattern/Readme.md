# Command Design Pattern

The Command design pattern encapsulates a request as an object, allowing decoupling the object that invokes the request (client) from the object that handles the request (receiver). This pattern promotes loose coupling, flexibility, and the ability to queue and undo/redo commands.

## When to Use:

* When you want to decouple the client from the receiver of a request.
* When you need to queue or log commands for later execution.
* When you want to implement undo/redo functionality.

## Benefits:

* Decoupling: Separates the client from the receiver, promoting loose coupling and maintainability.
* Flexibility: Commands can be easily added, removed, or modified without affecting the client or receiver.
* Queueing and Logging: Commands can be queued for execution at a later time or logged for auditing purposes.
* Undo/Redo: Commands can be designed to support undo/redo functionality by implementing methods to revert their actions.

## Implementation:

1. Command Interface: Defines the common interface for all commands. It typically includes a execute() method that performs the action.
2. Concrete Commands: Implement the Command interface and encapsulate specific requests.
3. Invoker: Invokes the commands. It can be unaware of the specific receiver objects.
4. Optional: Receiver: (Not always required) Represents the actual object that performs the action upon receiving a command.

![img.png](../CommandPattern%20/img.png)

## Example:

```Java
public interface Command {
  void execute();
}

public class LightOnCommand implements Command {
  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }
}

public class LightOffCommand implements Command {
  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }
}

public class Light {
  public void on() {
    System.out.println("Light turned on");
  }

  public void off() {
    System.out.println("Light turned off");
  }
}

public class RemoteControl {

  private Command[] onCommands;
  private Command[] offCommands;

  public RemoteControl() {
    onCommands = new Command[7];
    offCommands = new Command[7];

    // Initialize commands with specific receivers
    Command noCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot]  = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
  }
}

public class NoCommand implements Command {
  @Override
  public void execute() {
    // Do nothing (null object pattern)
  }
}

public class Main {
  public static void main(String[] args) {
    Light livingRoomLight = new Light();
    LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

    RemoteControl remote = new RemoteControl();
    remote.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);

    remote.onButtonWasPushed(0); // Output: Light turned on
    remote.offButtonWasPushed(0); // Output: Light turned off
  }
}
```

````python
from abc import ABC, abstractmethod

class Command(ABC):
  @abstractmethod
  def execute(self):
    pass

class LightOnCommand(Command):
  def __init__(self, light):
    self.light = light

  def execute(self):
    self.light.on()

class LightOffCommand(Command):
  def __init__(self, light):
    self.light = light

  def execute(self):
    self.light.off()

class Light:
  def on(self):
    print("Light turned on")

  def off(self):
    print("Light turned off")

class RemoteControl:
  def __init__(self):
    self.on_commands = [None] * 7
    self.off_commands = [None] * 7

  def set_command(self, slot, on_command, off_command):
    self.on_commands[slot] = on_command
    self.off_commands[slot] = off_command

  def on_button_was_pushed(self, slot):
    if self.on_commands[slot]:
      self.on_commands[slot].execute()

  def off_button_was_pushed(self, slot):
    if self.off_commands[slot]:
      self.off_commands[slot].execute()

class NoCommand(Command):
  def execute(self):
    pass  # Do nothing (null object pattern)

# Usage
living_room_light = Light()
living_room_light_on_command = LightOnCommand(living_room_light)
living_room_light_off_command = LightOffCommand(living_room_light)

remote = RemoteControl()
remote.set_command(0, living_room_light_on_command, living_room_light_off_command)

remote.on_button_was_pushed(0)  # Output: Light turned on
remote.off_button_was_pushed(0)  # Output: Light turned off
````

## Key Points:

* The Command pattern promotes loose coupling by decoupling the client from the receiver of the request.
* Commands can be easily added, removed, or modified without affecting other parts of the system.
* The pattern allows for queuing commands for later execution or logging them for auditing purposes.
* With careful design, commands can be implemented to support undo/redo functionality.



