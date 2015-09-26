kife
====

A shot at 3D life-like cellular automation.

Every box is only connected to its 8 diagonal neighbors. So really we have mesh of diagonal cells, in 3D coordinates cell only exists if (x, y, z) are all even or all odd.

![Cell and its neighbors](https://raw.github.com/alamar/kife/master/neighbors.png)

8 neighbors should allow for life-like rules.

For visualizations, I use openscad, with some effort it allows animations and colours.

![Beautiful oscillator-4](https://raw.github.com/alamar/kife/master/oscillator3.gif)

See examples in `lifes/`

I'm experimenting with rules, B2 grows explosively, B3 always stabilizes, struggle to figure out if there are chaotic rules.

How to run: you need maven.

`% mvn compile`

`% mvn exec:java`

This runs random population. Emitting openscad code on some steps. Put to `lifes/`, add `use <kife.scad>`, there you go. Currently you still have to add animations manually.

For experiments, edit the source.
