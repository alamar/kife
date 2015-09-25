kife
====

A shot at 3D life-like cellular automation.

Every box is only connected to its 8 diagonal neighbors. So really we have mesh of diagonal cells, in 3D coordinates cell only exists if (x, y, z) are all even or all odd.
8 neighbors should allow for life-like rules.
Visualisation is tricky, I use openscad, emitting scad definitions programmatically.

I'm experimenting with rules, B2 grows explosively, B3 always stabilizes, struggle to figure out if there are chaotic rules.

How to run: you need maven. mvn compile. mvn exec:java
For experiments, edit the source.
