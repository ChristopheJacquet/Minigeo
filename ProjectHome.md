# Minigeo #

**Minigeo** is a lightweight Java library that allows one to plot geographical data (namely lines between points determined by geographic coordinates — a latitude-longitude pair), using [Universal Transverse Mercator](http://en.wikipedia.org/wiki/Universal_Transverse_Mercator_coordinate_system) (UTM) projections.

The display is done using a Swing JFrame. The user may pan and zoom with the mouse _à la_ Google Maps (i.e. drag to pan, scroll to zoom).

It is especially useful for educators, as students can very easily use this library during practical sessions.

![http://minigeo.googlecode.com/svn/wiki/images/minigeo_osmdata.png](http://minigeo.googlecode.com/svn/wiki/images/minigeo_osmdata.png)

_The screenshot shows a Minigeo window displaying OpenStreetMap data as wireframe._

[Download latest JAR](http://code.google.com/p/minigeo/downloads/list) |
[Browse Javadoc](http://minigeo.googlecode.com/svn/trunk/MiniGeo/doc/index.html)

## Mini tutorial ##

Using Minigeo is really straightforward:

1) Create a _map window_:

```
MapWindow window = new MapWindow();
```

2) Add segments to the window:

```
window.addSegment(
    new Segment(
        new Point(48, 2),
        new Point(45, -1),
        Color.RED));
...
```

3) Make the window visible:

```
window.setVisible(true);
```

**That's it.**

Have a look at [MinigeoDemo.java](http://code.google.com/p/minigeo/source/browse/trunk/MiniGeo/src/MinigeoDemo.java): it loads coordinates from a text file (`france.poly`) and draws a polygon (France's borders and coast lines) using Minigeo.