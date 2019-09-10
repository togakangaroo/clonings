;; strings2.clj
;; Make the tests pass! Scroll down for hints :)

(ns strings.strings2
  (:require [clojure.test :refer [deftest is]]
            [clojure.string :as string]))

(defn print-fruit-order [fruit-name n]
  ;; complete the function here!
  (str "You have ordered: " n " " fruit-name))

(deftest return-formatted-string
  (is (= "You have ordered: 5 kumquats"
         (print-fruit-order "kumquats" 5)))
  (is (= "You have ordered: 7 durians"
         (print-fruit-order "durians" 7))))

(defn mangle-string [s]
  ;; complete the function here!
  (string/upper-case
   (string/reverse s)))

(deftest return-mangled-string
  (is (= "TON OD RO OD"
         (mangle-string "do or do not")))
  (is (= "REWOP DETIMILNU"
         (mangle-string "unlimited power"))))




























;; for `mangle-string`, you'll have to combine two or more functions in the
;; clojure.string api to complete the exercise!
