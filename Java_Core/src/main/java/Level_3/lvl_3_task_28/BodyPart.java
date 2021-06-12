package Level_3.lvl_3_task_28;

public final class BodyPart {
  final static BodyPart LEG = new BodyPart("нога");
  final static BodyPart HEAD = new BodyPart("голова");
  final static BodyPart ARM = new BodyPart("рука");
  final static BodyPart CHEST = new BodyPart("грудь");

  private String bodyPart;

  private BodyPart(String bodyPart) {
    this.bodyPart = bodyPart;
  }

  @Override
  public String toString() {
    return this.bodyPart;
  }
}
