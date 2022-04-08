Feature: datatable feature

  Scenario: datatable as list

    Given user write "Java"

    #tek bir list, türü String
    When user write the followings
      | Java   |
      | C#     |
      | Python |

    # listlerimizz  var. listlerin listesi
    When user write the following integers
      | 1 |11|
      | 2 |12|
      | 3 |13|

    #[
    # [1,12]
    # [2,12]
    # [3,13]
    # ]

   # listlerimizz  var. listlerin listesi
    When user login as follows
      | kullanici1|sifre1"|0|
      | kullanici2|sifre2"|0|
      | ali@gmail.com|sifre3"|1|




