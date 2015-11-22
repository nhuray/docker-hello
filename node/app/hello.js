// Load the http module to create an http server.
var http = require('http');
var swig  = require('swig');
var config = require('config');
var os = require("os");

var greeting = config.get("greeting");

var server = http.createServer(function (request, response) {
    response.writeHead(200, {"Content-Type": "text/html"});
    response.end(swig.renderFile('index.html', {
        greeting: greeting,
        hostname: os.hostname()
    }));
});

server.listen(8000);
