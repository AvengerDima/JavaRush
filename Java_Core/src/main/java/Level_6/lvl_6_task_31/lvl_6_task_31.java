package Level_6.lvl_6_task_31;

/*
Factory method pattern
*/

import Level_6.lvl_6_task_31.common.ImageReader;
import Level_6.lvl_6_task_31.common.ImageTypes;

public class lvl_6_task_31 {
  public static void main(String[] args) {
    ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
  }
}
