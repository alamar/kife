module step0 ()
{
  translate([-4, -10, -4]) {
    translate([3, 7, 7]) { cube(1); }
    translate([0, 6, 6]) { cube(1); }
    translate([0, 4, 8]) { cube(1); }
    translate([1, 7, 7]) { cube(1); }
    translate([1, 7, 5]) { cube(1); }
    translate([1, 5, 7]) { cube(1); }
    translate([2, 8, 6]) { cube(1); }
    translate([1, 5, 9]) { cube(1); }
    translate([0, 6, 8]) { cube(1); }
  }
}

module step1 ()
{
  translate([-4, 2, -4]) {
    translate([-1, 5, 7]) { cube(1); }
    translate([0, 4, 8]) { cube(1); }
    translate([2, 6, 6]) { cube(1); }
    translate([1, 7, 7]) { cube(1); }
    translate([2, 6, 8]) { cube(1); }
    translate([1, 7, 5]) { cube(1); }
    translate([1, 5, 7]) { cube(1); }
    translate([2, 8, 6]) { cube(1); }
    translate([1, 5, 9]) { cube(1); }
  }
}

step0();

step1();

