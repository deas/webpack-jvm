# Experimenting with webpack executing in the jvm

When I grow up, I want to be a webpack loader implemented in Clojure.
At this time, we are just proving the jvm can run webpack in j2v8.

## Usage

Unless you are on Linux, you will have to (un)comment the appropriate entry for your os in `project.clj`.

```
yarn install
lein webpack
```

If all goes well, you should end up with `dist/bundle.js`

## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version
