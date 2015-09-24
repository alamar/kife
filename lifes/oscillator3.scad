module step1 ()
{
  translate([-4, -12, -4]) {
    translate([7, 5, 1]) { cube(1); }
    translate([7, 3, 3]) { cube(1); }
    translate([7, 5, 3]) { cube(1); }
    translate([8, 4, 2]) { cube(1); }
    translate([6, 6, 0]) { cube(1); }
    translate([6, 4, 4]) { cube(1); }
    translate([8, 6, 2]) { cube(1); }
    translate([7, 7, 1]) { cube(1); }
  }
}

module step2 ()
{
  translate([-4, -4, -4]) {
    translate([7, 5, 1]) { cube(1); }
    translate([7, 3, 3]) { cube(1); }
    translate([6, 6, 2]) { cube(1); }
    translate([7, 5, 3]) { cube(1); }
    translate([6, 6, 0]) { cube(1); }
    translate([5, 5, 3]) { cube(1); }
    translate([6, 4, 2]) { cube(1); }
    translate([5, 5, 1]) { cube(1); }
    translate([6, 4, 4]) { cube(1); }
    translate([7, 7, 1]) { cube(1); }
  }
}

module step3 ()
{
  translate([-4, 4, -4]) {
    translate([7, 3, 3]) { cube(1); }
    translate([6, 6, 2]) { cube(1); }
    translate([8, 4, 2]) { cube(1); }
    translate([6, 6, 0]) { cube(1); }
    translate([5, 5, 3]) { cube(1); }
    translate([6, 4, 2]) { cube(1); }
    translate([5, 5, 1]) { cube(1); }
    translate([6, 4, 4]) { cube(1); }
    translate([8, 6, 2]) { cube(1); }
    translate([7, 7, 1]) { cube(1); }
  }
}

step1();
step2();
step3();
