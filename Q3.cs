using Microsoft.VisualStudio.TestTools.UnitTesting;
using RestSharp;
using RestSharp.Deserializers;
using RestSharpExamples.DataEntities;

namespace RestSharpExamples.Tests
{
    [TestClass]
    public class ActivityTypeTest
    {
        [TestMethod]
        public void TypeTest()
        {
            // Get call
            RestClient client = new RestClient("https://www.boredapi.com/api/");
            RestRequest request = new RestRequest("activity?type=social", Method.GET);

            // act
            IRestResponse response = client.Execute(request);

            SocialResponse socialResponse =
                new JsonDeserializer().
                Deserialize<LocationResponse>(response);

            // assert
            Assert.That(socialResponse.type, Is.EqualTo("social"));
        }

        
    }
}