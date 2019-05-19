/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.mat.project;

import java.awt.Color;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;

class MyDefaultMetalTheme extends DefaultMetalTheme {
  @Override
  public ColorUIResource getWindowTitleInactiveBackground() {
    return new ColorUIResource(Color.decode("#46BCFD"));
  }

  @Override
  public ColorUIResource getWindowTitleBackground() {
    return new ColorUIResource(Color.decode("#46BCFD"));
  }

  @Override
  public ColorUIResource getPrimaryControlHighlight() {
    return new ColorUIResource(Color.decode("#46BCFD"));
  }

  @Override
  public ColorUIResource getPrimaryControlDarkShadow() {
    return new ColorUIResource(Color.decode("#46BCFD"));
  }

  @Override
  public ColorUIResource getPrimaryControl() {
    return new ColorUIResource(Color.decode("#CFEEFF"));
  }

  @Override
  public ColorUIResource getControlHighlight() {
    return new ColorUIResource(Color.decode("#000000"));
  }

  @Override
  public ColorUIResource getControlDarkShadow() {
    return new ColorUIResource(Color.decode("#000000"));
  }

  @Override
  public ColorUIResource getControl() {
    return new ColorUIResource(Color.decode("#CFEEFF"));
  }
}