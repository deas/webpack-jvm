(require '[cljs.build.api :as bapi])

(import '(com.eclipsesource.v8 V8 NodeJS V8Object V8Array JavaCallback))

(def callback
  (reify JavaCallback
    (invoke [this receiver parameters]
      "Hallo from clj! I want to be a webpack cljs-loader.")))

;; (def v8 (V8/createV8Runtime))
(def node-script (java.io.File. "webpack.js"))
(def node-js (NodeJS/createNodeJS))
(def v8 (.getRuntime node-js))
(.registerJavaMethod v8 callback "hallo_clj")
;; (println "node-version " (.getNodeVersion node-js))
(.exec node-js node-script)
(while (.isRunning node-js)
  (.handleMessage node-js))
