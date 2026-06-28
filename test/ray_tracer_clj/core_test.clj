(ns ray-tracer-clj.core-test
  (:require [clojure.test :refer :all]
            [ray-tracer-clj.core :refer :all]))

(deftest a-test
  (testing "the main entry point prints the expected greeting"
    (is (= "Hello, World!\n" (with-out-str (-main))))))
