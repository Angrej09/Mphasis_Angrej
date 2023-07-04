using Newtonsoft.Json;
using System.Collections.Generic;

namespace RestSharpExamples.TestFolder
{
    public class SocialResponse
    {
       
		[JsonProperty("activity")]
        public string activity { get; set; }
        [JsonProperty("type")]
        public string type { get; set; }
        
    }
}