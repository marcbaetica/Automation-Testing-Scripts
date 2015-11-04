#!/bin/bash
#open two sites in the browser and after a random amount of time close the browser
chromium-browser http://www.youtube.com/watch?v=7bLaLJ51rRk http://www.youtube.com/watch?v=OxYSaT_NfjQ &
n=$((RANDOM%90+30))
echo $n
sleep $n
killall chromium-browser
echo "all done!"
