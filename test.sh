#!/bin/bash

# Define the directory to search
SEARCH_DIR="cmd-loader/main/default/classes"

# Output file
OUTPUT_FILE="test_classes.txt"

# Clear the output file
> "$OUTPUT_FILE"

# Find all Apex classes that contain the @isTest annotation
find "$SEARCH_DIR" -type f -name "*.cls" | while read -r file; do
  if grep -q "@isTest" "$file"; then
    # Extract class name from file name and append to output file
    class_name=$(basename "$file" .cls)
    echo "$class_name" >> "$OUTPUT_FILE"
  fi
done