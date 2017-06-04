console.log("Running on node " + process.version);

var webpack = require('webpack'),
    path  = require('path'),
    config = {
        entry : "./main",
        output : {
            path : path.resolve(__dirname, "dist"),
            filename : "bundle.js",
            publicPath : "/assets/"
        }
    };


webpack(
    config
    , (err, stats) => {
        if (err || stats.hasErrors()) {
	          console.error(err);
	          console.error(stats);
        } else {
	          console.log("Success");
	      }
	      console.log(hallo_clj());
});
