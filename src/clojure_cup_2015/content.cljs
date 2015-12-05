(ns clojure-cup-2015.content
  (:require [clojure-cup-2015.core :refer [editor]]))

(defn quil-editor [id default-code]
  [:div
   [editor default-code]
   [:canvas {:id id}]])

(defn chapter-1 []
  [:div
   [:p "Quil lets you do visual programming. You can make drawings and animations, and give instant feedback to user interaction."]
   [:p "A Quil program is called a sketch. Here's a sketch of three pink triangles on a blue background."]
   [quil-editor
    "pink-triangles" "(defn draw-pink-triangles []
  (no-stroke)

  (fill 244 213 221) ;; #f4d5dd
  (triangle 20 20, 60 90, 15 60)

  (fill 249 202 216) ;; #f9cad8
  (triangle 220 210, 280 260, 215 240)

  (fill 232 181 188) ;; #e8b5bc
  (triangle 150 40, 227 50, 90 170))

(defsketch pink-triangles
  :host \"pink-triangles\"
  :size [300 300]
  :draw draw-pink-triangles)"]]
  )
