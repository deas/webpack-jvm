// https://webpack.js.org/development/how-to-write-a-loader/

const loaderUtils = require("loader-utils");

// Identity loader with SourceMap support
/*
module.exports = function(source, map) {
    // const options = loaderUtils.getOptions(this);
    // this.callback(null, source, map);
    console.log("cljs-loader: Consuming " + source);
    return "console.log('hallo from cljs-loader');";
};
*/

module.exports = compile_cljs;