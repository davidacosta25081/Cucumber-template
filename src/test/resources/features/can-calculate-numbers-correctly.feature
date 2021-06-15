#Author: mwalsh@qa.com

Feature: Can calculate numbers correctly?
  To test whether addition, subtraction, multiplication and division return the correct
  results.
  
  Todo:
  
  - Implement subtraction
  - Implement division
  - Implement multiplication

  Scenario Outline: <left_operand> add <right_operand> is <expected_result>
    
    Given a calculator
    When <left_operand> and <right_operand> are added
    Then the result should be <expected_result>
    
    Examples:
    | left_operand | right_operand | expected_result |
    | 3.0 	       | 4.0           | 7.0             |
    | 89.0 		   | 9.0           | 98.0            |
    | 9.0          | 89.0          | 98.0            |
    | 0.0          | 3.0           | 3.0             |
    | 0.0          | -3.0          | -3.0            |
    | 2.5          | 2.5           | 5.00            |


Scenario Outline: <left_operand> substracts <right_operand> equals <expected_result>
    
    Given a calculator
    When <left_operand> and <right_operand> are substracted
    Then the result should be <expected_result>
    
    Examples:
    | left_operand | right_operand | expected_result |
    | 8.0 	       | 4.0           | 4.0             |
    | 99.0 		   | 9.0           | 90.0            |
    | 9.0          | 2.0           | 7.0             |
    | 100.0        | 7.0           | 93.0            |
    | 13.0         | -3.0          | 10.0            |
    | 2.5          | 0.5           | 2.0             |

    
    Scenario Outline: <left_operand> divided by <right_operand> equals <expected_result>
    
    Given a calculator
    When <left_operand> is divided by <right_operand> 
    Then the result should be <expected_result>
    
    Examples:
    | left_operand | right_operand | expected_result |
    | 10.0 	       | 2.0           | 5.0             |
    | 18.0 		   | 3.0           | 6.0             |
    | 20.0         | 5.0           | 4.0             |
    | 30.0         | 5.0           | 6.0             |
    | 20.0         | 2.0           | 10.0            |
    | 49.0         | 7.0           | 7.0             |
    
    
    
    Scenario Outline: <left_operand> multiplies <right_operand> equals <expected_result>
    
    Given a calculator
    When <left_operand> multiplies <right_operand> 
    Then the result should be <expected_result>
    
    Examples:
    | left_operand | right_operand | expected_result |
    | 3.0 	       | 3.0           | 9.0             |
    | 10.0 		   | 9.0           | 90.0            |
    | 9.0          | 9.0           | 81.0            |
    | 5.0          | 4.0           | 20.0            |
    | 3.0          | 3.0           | 9.0             |
    | 2.0          | 2.0           | 4.0             |
    
    