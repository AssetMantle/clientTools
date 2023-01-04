#!/usr/bin/env bash

protobufLibraries=$HOME"/protobuf/src"

proto_dirs=$(find ./proto -path -prune -o -name '*.proto' -print0 | xargs -0 -n1 dirname | sort | uniq)
for dir in $proto_dirs; do
   f=$(find "${dir}" -maxdepth 1 -name '*.proto')
  protoc \
  -I "proto" \
  -I "$protobufLibraries" \
  -I "third_party/proto" \
  --java_out="." \
  $f

done