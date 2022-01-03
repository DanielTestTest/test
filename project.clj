(defproject app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[clj-http "3.12.3"]
                 [org.clojars.danielhvs/notion-to-md "0.1.1"]
                 [org.clojure/clojure "1.10.0"]]
  :aliases {"notion-to-md"     ["run" "-m" "notion-to-md.core"]}
  :repl-options {:init-ns app.core})


