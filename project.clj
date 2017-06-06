(def dep (symbol "com.eclipsesource.j2v8/j2v8_linux_x86_64"))
;; 4.6.0 is node v5.9.1
;; 4.7.0 is node v7.4.1 - n/a on for mac/windows on maven central
(def dep-version "4.7.0")
(defn get-dep[]
  (let [os (.toLowerCase (System/getProperty "os.name"))
        os-suffix (cond
                    (>= (.indexOf os "linux") 0) "linux"
                    (>= (.indexOf os "win") 0) "win32"
                    (>= (.indexOf os "mac") 0) "macos")]
    (symbol (str "com.eclipsesource.j2v8/j2v8_" os-suffix "-x86_64"))))

(defproject webpack-jvm-clj "0.1.0-SNAPSHOT"
  :description "Experimenting with webpack executing on the JVM"
  :url "https://github.com/deas/webpack-jvm-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript  "1.9.562"]
                 [~dep ~dep-version ]]
  :aliases {"webpack" ["do"
                       ["run" "-m" "clojure.main" "webpack.clj"]]})
