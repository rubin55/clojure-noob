(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (if true
    "The hammer!"
    "This line won't be printed because it's else'd")

  (if false
    "This line won't be printed because it's then'd"
    "The elbow!")

  (if true
    (do (println "Matched true!") ;; Then
      "By Zeus's hammer!")
    (do (println "Not true!") ;; Else
      "By Aquaman's trident!"))

  (when true
    (println "A When operation!")
    "abra cadabra")

  (def failed-protagonist-names
    ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"])

  (def some-string
    "String string")


  (println (:a {:a 1 :b 2 :c 3}))
  (println ({:a 1 :b 2 :c 3} :b))
  (println (get {:a 1 :b 2 :c 3} :c))
  (println "I'm a little teapot!"))
