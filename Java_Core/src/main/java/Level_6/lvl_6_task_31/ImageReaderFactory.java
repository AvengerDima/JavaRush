package Level_6.lvl_6_task_31;

import Level_6.lvl_6_task_31.common.*;

public class ImageReaderFactory {
  public static ImageReader getImageReader(ImageTypes types) {
    if (ImageTypes.JPG == types) {
      return new JpgReader();
    } else if (ImageTypes.PNG == types) {
      return new PngReader();
    } else if (ImageTypes.BMP == types) {
      return new BmpReader();
    }
    throw new IllegalArgumentException("Неизвестный тип картинки");
  }
}
