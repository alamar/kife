use <kife.scad>

if ($t < 0.16)
kife_draw([[7, 5, 1], [7, 3, 3], [6, 6, 2], [7, 5, 3],
           [8, 4, 2], [6, 6, 0], [6, 4, 2], [6, 4, 4],
           [8, 6, 2], [7, 7, 1]]);
else if ($t < 0.33)
kife_draw([[7, 3, 3], [6, 6, 2], [8, 4, 2], [6, 6, 0],
           [5, 5, 3], [6, 4, 2], [5, 5, 1], [6, 4, 4],
           [8, 6, 2], [7, 7, 1]]);
else if ($t < 0.5)
kife_draw([[7, 3, 3], [6, 6, 2], [6, 6, 0], [5, 5, 3],
           [6, 4, 2], [5, 5, 1], [6, 4, 4], [7, 7, 1]]);
else if ($t < 0.67)
kife_draw([[7, 5, 1], [7, 3, 3], [6, 6, 2], [7, 5, 3],
           [6, 6, 0], [5, 5, 3], [6, 4, 2], [5, 5, 1],
           [6, 4, 4], [7, 7, 1]]);
else if ($t < 0.83)
kife_draw([[7, 5, 1], [7, 3, 3], [7, 5, 3], [8, 4, 2],
           [6, 6, 0], [5, 5, 3], [5, 5, 1], [6, 4, 4],
           [8, 6, 2], [7, 7, 1]]);
else
kife_draw([[7, 5, 1], [7, 3, 3], [7, 5, 3], [8, 4, 2],
           [6, 6, 0], [6, 4, 4], [8, 6, 2], [7, 7, 1]]);