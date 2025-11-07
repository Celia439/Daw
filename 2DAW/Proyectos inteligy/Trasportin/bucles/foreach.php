<!DOCTYPE html>
<html>
<head>
    <title>bucle</title>
</head>
<body>
<?php
$num = array(1, 5, 8, 7, 6, 2, 4, 6, 4);
$numMasPequeño = 100;
foreach ($num as $numAct) {
    if ($numAct < $numMasPequeño) {
        $numMasPequeño = $numAct;
    }
}
echo $numMasPequeño;
?>
</body>
</html>

