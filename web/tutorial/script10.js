window.onload = choosePic;

var myPix = new Array("images/lion.jpg","images/tiger.jpg","images/bear.jpg");

var clicks = 0;

function choosePic() {
    randomNum = Math.floor((Math.random() * myPix.length));
    document.getElementById("myPicture").src = myPix[randomNum];
}

var clicks = 0;
function onClick() {
    clicks += 1;
    document.getElementById("clicks").innerHTML = clicks;
};