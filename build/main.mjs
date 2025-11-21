import * as squint_core from 'squint-cljs/core.js';
import * as squint_DOT_string from 'squint-cljs/src/squint/string.js';
import yargs from 'yargs';
import { hideBin } from 'yargs/helpers';
var argv = yargs(hideBin(process.argv)).usage("Usage: $0 [options]").option("port", ({"alias": "p", "describe": "Port number", "type": "number", "default": 8080})).option("verbose", ({"alias": "v", "describe": "Enable verbose mode", "type": "boolean"})).help().parse();
squint_core.println("Port:", argv.port);
if (squint_core.truth_(argv.verbose)) {
squint_core.println("Verbose mode enabled")};

export { argv }
