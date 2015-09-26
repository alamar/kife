use <hsvtorgb.scad>

module kife_paint (dot)
{
  hue = ((dot[0] % 2) == 1 ?
    dot[0] * 21 + dot[1] * 44 + dot[2] * 67 :
    dot[0] * 53 + dot[1] * 31 + dot[2] * 15) % 128;
  color(hsvToRGB(hue / 128, 0.7, 0.9, 0.7))
  children();
}

module kife_draw (dots)
{
  for (i = [0 : len(dots) - 1])
  kife_paint(dots[i])
  translate(dots[i])
  cube(1);
}
