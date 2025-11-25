import * as squint_core from 'squint-cljs/core.js';
import mri from 'mri';
var settings = mri(scriptArgs, ({"alias": ({"p": "port", "v": "verbose"}), "default": ({"port": 8080, "verbose": false})}));
print(settings.port);
print(settings.verbose);
print(settings._);

export { settings }
