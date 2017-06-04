(defproject webpack-jvm-clj "0.1.0-SNAPSHOT"
  :description "Experimenting with webpack executing on the JVM"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript "1.9.562"]
                 ;; n/a on mvn central macosx/windows?
                 ;; [com.eclipsesource.j2v8/j2v8_linux_x86_64 "4.7.0"]
                 [com.eclipsesource.j2v8/j2v8_linux_x86_64 "4.6.0"]
                 ;; [com.eclipsesource.j2v8/j2v8_macosx_x86_64 "4.6.0"]
                 ;; [com.eclipsesource.j2v8/j2v8_win32_x86_64 "4.6.0"]
                 ]
  :aliases {"webpack" ["do"
                       ["run" "-m" "clojure.main" "webpack.clj"]]})
