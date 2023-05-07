# !pip install openai
import openai
from openai.embeddings_utils import get_embedding, cosine_similarity

api_key = ''
openai.api_key = api_key


# Set up the OpenAI GPT-3 API request
model_engine = "text-davinci-002"

def get_initial_response(prompt):
    completions = openai.Completion.create(
        engine = model_engine,
        prompt = prompt,
        max_tokens = 2048,
        n = 1,
        stop = None,
        temperature=0.5,
    )
    message = completions.choices[0].text
    return message



def getSampleInput():
    prompt = """Write a welcome letter to a student, inviting them to use a platform called TeamBride that acts as a virtual teaching assistant"""
    return get_initial_response(prompt)