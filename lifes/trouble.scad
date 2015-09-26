for (x = [0 : 5], y = [0 : 5], z = [0 : 5])
{
    translate([y - x, y + x, x - y])
    cube(1);
}

translate([3, 7, -1])
color([0.8, 0.2, 0.2])
cube(1);

translate([1, 5, 1])
color([0.8, 0.2, 0.2])
cube(1);