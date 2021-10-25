# rot-text

A Ceasar cipher.

## Run

```
# First argument is the amount of rotation (shift)--second argument is the text

$ lein run 3 "So then, down the cobble stone path the rabbit made its course."
VR WKHQ, GRZQ WKH FREEOH VWRQH SDWK WKH UDEELW PDGH LWV FRXUVH.

$ lein run -3 "VR WKHQ, GRZQ WKH FREEOH VWRQH SDWK WKH UDEELW PDGH LWV FRXUVH."
SO THEN, DOWN THE COBBLE STONE PATH THE RABBIT MADE ITS COURSE.
```

## Tests

```
$ lein test
```
