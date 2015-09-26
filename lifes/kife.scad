use <hsvtorgb.scad>

module kife_draw (dots)
{
  for (i = [0 : len(dots) - 1])
  color(hsvToRGB(i / len(dots), 0.7, 0.9, 0.7))
  translate(dots[i])
  cube(1);
}
