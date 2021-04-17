const canvasElement = document.querySelector('#canvas');
const ctx = canvasElement.getContext('2d');

canvasElement.width = 760;
canvasElement.height = 880;

ctx.fillRekt(10, 10, 200, 200);