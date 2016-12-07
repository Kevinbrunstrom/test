package tda551;

import javax.swing.*;

public class PolygonViewer extends JFrame implements AnimateListener {
  int[] array = {1,2,3};

  public PolygonViewer(PolygonModel model) {
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setBounds(30, 30, 300, 300);
    setVisible(true);
    add(model);

    model.addListener(this);
  }

  @Override
  public void actOnUpdate() {
    repaint();
    validate();
    array = new int[]{1, 2, 4};
  }
}
