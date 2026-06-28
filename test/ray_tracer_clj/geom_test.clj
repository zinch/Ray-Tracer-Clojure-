(ns ray-tracer-clj.geom-test
  (:require [clojure.test :refer :all]
            [ray-tracer-clj.geom :refer :all]))

(deftest a-tuple-point-test
  (testing "A tuple with w=1.0 is a point"
    ;; Given
    (let [a (tuple 4.3  -4.2  3.1  1.0)]

      ;; Then
      (is (= 4.3 (:x a)))
      (is (= -4.2 (:y a)))
      (is (= 3.1 (:z a)))
      (is (= 1.0 (:w a)))
      (is (point? a))
      (is (not (vector? a))))))